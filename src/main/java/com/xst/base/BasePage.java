package com.xst.base;

import lombok.Data;

/**
 * @author GUO
 * @Classname BasePage
 * @Description 分页
 * @Date 2020/11/16 20:27
 */
@Data
public class BasePage {
    private Integer pageIndex;

    private Integer pageSize;
}
