package com.dj.pms.api;

import com.dj.pms.service.SystemService;
import com.dj.pms.utils.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class IndexController {

    @Autowired
    SystemService systemService;

    @GetMapping("/")
    public ResultDto<String> getIndex() throws InterruptedException {
        log.info("测试请求");
        systemService.info("测试请求");
        return ResultDto.OK("success");
    }
}
