package com.harshitbhardwaj.entity;

import java.util.List;

public class BeanResponse {

    private int beanCount;
    private List<BeanDetails> beans;

    public BeanResponse() {
    }

    public BeanResponse(List<BeanDetails> beans, int beanCount) {
        this.beanCount = beanCount;
        this.beans = beans;
    }

    public int getBeanCount() {
        return beanCount;
    }

    public void setBeanCount(int beanCount) {
        this.beanCount = beanCount;
    }

    public List<BeanDetails> getBeans() {
        return beans;
    }

    public void setBeans(List<BeanDetails> beans) {
        this.beans = beans;
    }
}