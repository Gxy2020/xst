package com.xst.domain;

import java.io.Serializable;

/**
 * @author GUO
 * @Classname Subject
 * @Description 学科
 * @Date 2020/11/3 15:08
 */
public class Subject implements Serializable {
    private static final long serialVersionUID = 8058095034457106501L;

    private Integer id;
    /*学科名字*/
    private String name;
    /*年级*/
    private Integer level;
    /*年级名字*/
    private String levelName;
    /*排序*/
    private Integer itemOrder;
    /*是否存在*/
    private Boolean deleted;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public Integer getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(Integer itemOrder) {
        this.itemOrder = itemOrder;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
