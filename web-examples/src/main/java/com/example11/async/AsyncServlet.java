package com.example11.async;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Logger;

@WebServlet(value = "/async", asyncSupported = true)
public class AsyncServlet extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(AsyncServlet.class.getName());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AsyncContext asyncContext = req.startAsync();
        CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(3000);
                asyncContext.getResponse().getWriter().println("async");
                LOGGER.info(Thread.currentThread().getName() + ": async; " + LocalTime.now());
                asyncContext.complete();
            } catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        });
        LOGGER.info(Thread.currentThread().getName() + ": main; " + LocalTime.now());
    }
}
