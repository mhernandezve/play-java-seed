package controllers;

import play.mvc.Result;
import static play.mvc.Results.ok;

public class TestController {
    public Result helloPlay() {
        return ok("Hola Play");
    }
}
