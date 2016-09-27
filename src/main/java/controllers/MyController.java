package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Первый класс-контроллер
 */
@Controller
@RequestMapping("/")
public class MyController {
    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    /**
     * http://localhost:8080/mul/9
     *
     * @param model
     * @param size
     * @return
     */
    @RequestMapping("mul/{size}")
    //@GetMapping("")
    public String mul(ModelMap model,
                      @PathVariable("size") int size) {
        return mulTable(model, size);
    }

    /**
     * http://localhost:8080/mul2?size=9
     *
     * @param model
     * @param size
     * @return
     */
    @RequestMapping("mul2")
    public String mul2(ModelMap model,
                       @RequestParam("size") int size) {
        return mulTable(model, size);
    }

    private String mulTable(ModelMap model, int size) {
        System.out.println("Table size = " + size);
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        // Передаём размер таблицы для отображения
        model.addAttribute("size", size);
        // Передаём саму таблицу
        model.addAttribute("table", table);
        return "mul";
    }
}
