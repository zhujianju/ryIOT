package com.ruoyi.project.iot.device.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 设备信息对象 con_device
 * 
 * @author ruoyi
 * @date 2019-11-22
 */
public class ConDevice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备Id */
    private Long id;

    /** 设备分类id */
    @Excel(name = "设备分类id")
    private String typeid;

    /** 参数 */
    @Excel(name = "参数")
    private Long paramid;

    /** 出入库key */
    @Excel(name = "出入库key")
    private String productkey;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String devicename;

    /** 密钥 */
    @Excel(name = "密钥")
    private String devicesecret;

    /** 激活状态 */
    @Excel(name = "激活状态")
    private Integer saleactivate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTypeid(String typeid) 
    {
        this.typeid = typeid;
    }

    public String getTypeid() 
    {
        return typeid;
    }
    public void setParamid(Long paramid) 
    {
        this.paramid = paramid;
    }

    public Long getParamid() 
    {
        return paramid;
    }
    public void setProductkey(String productkey) 
    {
        this.productkey = productkey;
    }

    public String getProductkey() 
    {
        return productkey;
    }
    public void setDevicename(String devicename) 
    {
        this.devicename = devicename;
    }

    public String getDevicename() 
    {
        return devicename;
    }
    public void setDevicesecret(String devicesecret) 
    {
        this.devicesecret = devicesecret;
    }

    public String getDevicesecret() 
    {
        return devicesecret;
    }
    public void setSaleactivate(Integer saleactivate) 
    {
        this.saleactivate = saleactivate;
    }

    public Integer getSaleactivate() 
    {
        return saleactivate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("typeid", getTypeid())
            .append("paramid", getParamid())
            .append("productkey", getProductkey())
            .append("devicename", getDevicename())
            .append("devicesecret", getDevicesecret())
            .append("saleactivate", getSaleactivate())
            .toString();
    }
}
