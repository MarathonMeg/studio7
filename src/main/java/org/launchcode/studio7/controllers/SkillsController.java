package org.launchcode.studio7.controllers;

import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String skills () {
        String html =
                "<html>" +
                        "<h1> Skills Tracker </h1>" +
                        "<h2> We have a few skills we would like to learn. Here is the List! </h2>"+
                        "<ol>" +
                        "<li> Java </li>" +
                        "<li> JavaScript </li>" +
                        "<li> Python </li>" +
                        "</ol>" +
                        "</html>";
        return html;

    }

    @GetMapping("form")
    @ResponseBody
    public String pickFavoriteLang () {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' >" +
                        "Name" +
                        "<br>" +
                        "<input type = 'text' name = 'name'/>" +
                        "<br>" +
                        "My favorite language:" +
                        "<br>" +
                        "<select name = 'choice1'>" +
                            "<option value = 'Java'>Java</option>" +
                            "<option value = 'JavaScript'>JavaScript</option>" +
                            "<option value = 'Python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "My second favorite language:" +
                        "<br>" +
                        "<select name = 'choice2'>" +
                            "<option value = 'Java'>Java</option>" +
                            "<option value = 'JavaScript'>JavaScript</option>" +
                            "<option value = 'Python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "My third favorite language:" +
                        "<br>" +
                        "<select name = 'choice3'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'JavaScript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<input type = 'submit' value = 'submit'/>"+
                        "</form>"+
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String formOutput (@RequestParam String name, @RequestParam String choice1, @RequestParam String choice2, @RequestParam String choice3) {
        String html =
        "<html>"+
                "<h1>"+
                "<b>" + name + "</b>" +
                "</h1>" +
                "<br>" +
                "<table>" +
                "<tr>" +
                    "<th>Preference</th>" +
                    "<th>Language</th>" +
                "</tr>" +
                "<tr>" +
                    "<td>First</td>"+
                    "<td>" + choice1  + "</td>"+
                "</tr>"+
                "<tr>" +
                    "<td>Second</td>"+
                    "<td>" + choice2 + "</td>"+
                "</tr>"+
                "<tr>" +
                    "<td>Third</td>"+
                    "<td>" + choice3 + "</td>"+
                "</tr>"+
                "</table>" +
                "</html>";
                return html;
    }
}
//th, tr, td
//ordered list
//"<ol>" +
//        "<li>" + choice1 + "</li>" +
//        "<li>" + choice2 + "</li>" +
//        "<li>" + choice3 + "</li>" +
//        "</ol>" +