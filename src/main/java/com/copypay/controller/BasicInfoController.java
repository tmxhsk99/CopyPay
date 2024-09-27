package com.copypay.controller;

import com.copypay.dto.response.BasicInfoListResponse;
import com.copypay.service.BasicInfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class BasicInfoController {
    private final BasicInfoService basicInfoService;

    @GetMapping("/basic-info")
    public String basic_info(){
        return "basic-info";
    }

    @GetMapping("/api/basic-info/list")
    @ResponseBody
    public List<BasicInfoListResponse> basicInfoListRes(){
        return basicInfoService.getBasicInfoList();
    }
}