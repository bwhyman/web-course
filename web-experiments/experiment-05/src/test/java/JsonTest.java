import com.entity.Title;
import com.util.JacksonUtils;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.JavaType;

import java.util.List;

public class JsonTest {

    static void main() {
        var mapper = JacksonUtils.getMapper();
        Title t1 = new Title(1, "讲师");
        Title t2 = new Title(2, "副教授");
        Title t3 = new Title(3, "教授");
        var titles = List.of(t1, t2, t3);
        String titleJson = mapper.writeValueAsString(t1);
        IO.println(titleJson);
        String json = mapper.writeValueAsString(titles);
        IO.println(json);

        // 反序列化
        Title title = mapper.readValue(titleJson, Title.class);
        IO.println(title.getName());
        // 反序列化集合泛型
        JavaType listType = mapper.getTypeFactory()
                .constructCollectionType(List.class, Title.class);
        List<Title> titlesList = mapper.readValue(json, listType);
        // List<Title> titlesList = mapper.readValue(json, new TypeReference<List<Title>>() {});
        IO.println(titlesList.get(0).getName());
    }
}
