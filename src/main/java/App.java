
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
/**
 * Created by Guest on 8/7/17.
 */
public class App {

    public static void main(String[] args) {


        get("/form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String userName = request.queryParams("user");
            String choiceA = request.queryParams("choiceA");
            String choiceB = request.queryParams("choiceB");

            return new ModelAndView(model, "form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/journeyOutput", (request,  response) -> {
            Map<String, String> model = new HashMap<String, String>();
            String choiceA = request.queryParams("choiceA");
            String choiceB = request.queryParams("choiceB");
            String userName = request.queryParams("user");


            AdventureSpark adventureSpark = new AdventureSpark();

            String goodChoice = adventureSpark.pathChoice(choiceA, choiceB);


            model.put("userName", userName);
            model.put("result", goodChoice);


            return new ModelAndView(model, "journeyOutput.hbs");
        }, new HandlebarsTemplateEngine());

    }

}
