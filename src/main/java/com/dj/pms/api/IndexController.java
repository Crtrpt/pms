package com.dj.pms.api;

import com.dj.pms.utils.ResultDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping("/")
    public ResultDto<String> getIndex() throws InterruptedException {
        Thread.sleep(1000*10);
        return ResultDto.OK("success");
    }
}
