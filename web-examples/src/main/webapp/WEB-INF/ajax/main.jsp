<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:useBean id="titles" scope="request" type="java.util.List<com.datasource.entity.Title>"/>
<p>
    基于职称查询教师： <br>
    <select name="title">
        <option></option>
        <c:forEach var="t" items="${titles}">
        <option value="${t.id}">${t.name}</option>
        </c:forEach>
    </select>
</p>
<div id="teachers"></div>
<script>
    $("select[name=title]").change(function () {
        let tid = $(this).val();
        if (!tid) {
            $("#teachers").html("")
            return;
        }
        $.ajax({
            url: "title-teachers",
            dataType: "html",
            data: {"tid": tid},
            beforeSend: () => {
                $("#teachers").load("ajax/loading.html")
            },
            success: resp => {
                $("#teachers").html(resp)
            }
        })
    })
</script>