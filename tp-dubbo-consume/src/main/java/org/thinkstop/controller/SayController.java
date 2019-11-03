package org.thinkstop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thinkstop.common.api.IUserService;

/**
 * @author huating
 * @Title: //TODO
 * @ProjectName tp-dubbo-nacos
 * @Description: TODO
 * @date 2019/8/6 15:55
 */
@RestController
public class SayController {

    @Reference(version = "1.0.5")
    private IUserService iUserService;

    @GetMapping("/say.go")
    public String say() {


        return iUserService.queryName("test");

    }

}
