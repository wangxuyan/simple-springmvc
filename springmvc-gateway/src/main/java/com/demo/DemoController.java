/**
 * Copyright (C), 2017-2018, 萌店信息科技有限公司
 * FileName: DemoController
 * Author:   wangxuyan
 * Date:     2018/2/23 23:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author wangxuyan
 * @create 2018/2/23
 * @since 1.0.0
 */
@Controller
@RequestMapping(path = "demo")
public class DemoController {
    @RequestMapping(path = "index", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "Hello springmvc.";
    }

}
