package com.example.step12.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sample/")
@Slf4j
class SampleController {
    @RequestMapping
    public void index() {
        log.info("SampleController#index()");
    }

    // @RequestMapping(value = "/basic", method = RequestMethod.GET)
    @GetMapping("basic")
    public void basicGet() {
        log.info("SampleController#basicGet()");
    }

    @PostMapping("basic")
    public void basicPost() {
        log.info("SampleController#basicPost()");
    }
}
