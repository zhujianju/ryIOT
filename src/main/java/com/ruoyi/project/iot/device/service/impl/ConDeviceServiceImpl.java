package com.ruoyi.project.iot.device.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.iot.device.mapper.ConDeviceMapper;
import com.ruoyi.project.iot.device.domain.ConDevice;
import com.ruoyi.project.iot.device.service.IConDeviceService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 设备信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-11-22
 */
@Service
public class ConDeviceServiceImpl implements IConDeviceService 
{
    @Autowired
    private ConDeviceMapper conDeviceMapper;

    /**
     * 查询设备信息
     * 
     * @param id 设备信息ID
     * @return 设备信息
     */
    @Override
    public ConDevice selectConDeviceById(Long id)
    {
        return conDeviceMapper.selectConDeviceById(id);
    }

    /**
     * 查询设备信息列表
     * 
     * @param conDevice 设备信息
     * @return 设备信息
     */
    @Override
    public List<ConDevice> selectConDeviceList(ConDevice conDevice)
    {
        return conDeviceMapper.selectConDeviceList(conDevice);
    }

    /**
     * 新增设备信息
     * 
     * @param conDevice 设备信息
     * @return 结果
     */
    @Override
    public int insertConDevice(ConDevice conDevice)
    {
        return conDeviceMapper.insertConDevice(conDevice);
    }

    /**
     * 修改设备信息
     * 
     * @param conDevice 设备信息
     * @return 结果
     */
    @Override
    public int updateConDevice(ConDevice conDevice)
    {
        return conDeviceMapper.updateConDevice(conDevice);
    }

    /**
     * 删除设备信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteConDeviceByIds(String ids)
    {
        return conDeviceMapper.deleteConDeviceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备信息信息
     * 
     * @param id 设备信息ID
     * @return 结果
     */
    @Override
    public int deleteConDeviceById(Long id)
    {
        return conDeviceMapper.deleteConDeviceById(id);
    }
}
