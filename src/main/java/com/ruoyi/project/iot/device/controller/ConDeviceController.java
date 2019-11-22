package com.ruoyi.project.iot.device.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.iot.device.domain.ConDevice;
import com.ruoyi.project.iot.device.service.IConDeviceService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 设备信息Controller
 * 
 * @author ruoyi
 * @date 2019-11-22
 */
@Controller
@RequestMapping("/iot/device")
public class ConDeviceController extends BaseController
{
    private String prefix = "iot/device";

    @Autowired
    private IConDeviceService conDeviceService;

    @RequiresPermissions("iot:device:view")
    @GetMapping()
    public String device()
    {
        return prefix + "/device";
    }

    /**
     * 查询设备信息列表
     */
    @RequiresPermissions("iot:device:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ConDevice conDevice)
    {
        startPage();
        List<ConDevice> list = conDeviceService.selectConDeviceList(conDevice);
        return getDataTable(list);
    }

    /**
     * 导出设备信息列表
     */
    @RequiresPermissions("iot:device:export")
    @Log(title = "设备信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ConDevice conDevice)
    {
        List<ConDevice> list = conDeviceService.selectConDeviceList(conDevice);
        ExcelUtil<ConDevice> util = new ExcelUtil<ConDevice>(ConDevice.class);
        return util.exportExcel(list, "device");
    }

    /**
     * 新增设备信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备信息
     */
    @RequiresPermissions("iot:device:add")
    @Log(title = "设备信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ConDevice conDevice)
    {
        return toAjax(conDeviceService.insertConDevice(conDevice));
    }

    /**
     * 修改设备信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ConDevice conDevice = conDeviceService.selectConDeviceById(id);
        mmap.put("conDevice", conDevice);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备信息
     */
    @RequiresPermissions("iot:device:edit")
    @Log(title = "设备信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ConDevice conDevice)
    {
        return toAjax(conDeviceService.updateConDevice(conDevice));
    }

    /**
     * 删除设备信息
     */
    @RequiresPermissions("iot:device:remove")
    @Log(title = "设备信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(conDeviceService.deleteConDeviceByIds(ids));
    }
}
