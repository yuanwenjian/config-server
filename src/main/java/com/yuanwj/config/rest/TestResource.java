package com.yuanwj.config.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.Arrays;

/**
 * Created by bmk on 17-9-29.
 */
@RestController
@RequestMapping("/api/v1/test/")
public class TestResource {

    private Logger LOG= LoggerFactory.getLogger(TestResource.class);

    @Inject
    private Environment environment;

}
