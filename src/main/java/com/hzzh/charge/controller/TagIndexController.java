package com.hzzh.charge.controller;

import com.hzzh.charge.model.TagIndex;
import com.hzzh.charge.service.TagIndexService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

/**
 * Created by lilaifeng on 2016/9/22.
 */
@RestController
@RequestMapping("/tagIndex")
public class TagIndexController {
    @Autowired
    private TagIndexService tagIndexService;


}
