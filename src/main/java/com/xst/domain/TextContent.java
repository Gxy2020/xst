package com.xst.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author GUO
 * @Classname TextContent
 * @Description 试卷框架 内容为JSON
 * @Date 2020/11/4 9:07
 */

public class TextContent  implements Serializable {
    private static final long serialVersionUID = -1279530310964668131L;

    public TextContent(){

    }

    public TextContent(String content, Date createTime) {
        this.content = content;
        this.createTime = createTime;
    }

    private Integer id;

    private String content;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

