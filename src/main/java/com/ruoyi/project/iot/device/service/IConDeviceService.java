package com.ruoyi.project.iot.device.service;

import com.ruoyi.project.iot.device.domain.ConDevice;
import java.util.List;

/**
 * 设备信息Service接口
 * 
 * @author ruoyi
 * @date 2019-11-22
 */
public interface IConDeviceService 
{
    /**
     * 查询设备信息
     * 
     * @param id 设备信息ID
     * @return 设备信息
     */
    public ConDevice selectConDeviceById(Long id);

    /**
     * 查询设备信息列表
     * 
     * @param conDevice 设备信息
     * @return 设备信息集合
     */
    public List<ConDevice> selectConDeviceList(ConDevice conDevice);

    /**
     * 新增设备信息
     * 
     * @param conDevice 设备信息
     * @return 结果
     */
    public int insertConDevice(ConDevice conDevice);

    /**
     * 修改设备信息
     * 
     * @param conDevice 设备信息
     * @return 结果
     */
    public int updateConDevice(ConDevice conDevice);

    /**
     * 批量删除设备信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteConDeviceByIds(String ids);

    /**
     * 删除设备信息信息
     * 
     * @param id 设备信息ID
     * @return 结果
     */
    public int deleteConDeviceById(Long id);
}
