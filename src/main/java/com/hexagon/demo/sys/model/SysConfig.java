package com.hexagon.demo.sys.model;

import javax.persistence.*;

@Table(name = "sys_config")
public class SysConfig {
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "config_key")
    private String configKey;

    @Column(name = "config_value")
    private String configValue;

    @Column(name = "config_desc")
    private String configDesc;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return config_key
     */
    public String getConfigKey() {
        return configKey;
    }

    /**
     * @param configKey
     */
    public void setConfigKey(String configKey) {
        this.configKey = configKey == null ? null : configKey.trim();
    }

    /**
     * @return config_value
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * @param configValue
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue == null ? null : configValue.trim();
    }

    /**
     * @return config_desc
     */
    public String getConfigDesc() {
        return configDesc;
    }

    /**
     * @param configDesc
     */
    public void setConfigDesc(String configDesc) {
        this.configDesc = configDesc == null ? null : configDesc.trim();
    }
}