package net.sunnada.base.controller;

import net.sunnada.base.pojo.TbLabel;
import net.sunnada.base.pojo.TbLabelExample;
import net.sunnada.base.service.TbLabelService;
import net.sunnada.pojo.IdWorker;
import net.sunnada.pojo.Result;
import net.sunnada.pojo.StatusCode;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/label")
@CrossOrigin
public class TbLabelController {
    @Resource
    private TbLabelService tbLabelService;

    @Resource
    private IdWorker idWorker;
    /**
     * 增加标签
     * @return
     */
    @PostMapping
    public Result add(@RequestBody TbLabel tbLabel){
        tbLabel.setId(idWorker.nextId()+"");
        tbLabelService.insertSelective(tbLabel);
        return new Result(StatusCode.OK,true,"添加成功",null);
    }

    /**
     * 标签全部列表
     * @return
     */
    @GetMapping
    public Result findAll(){
        List<TbLabel> data = tbLabelService.selectByExample(new TbLabelExample());
        Result result = new Result();
        result.setCode(StatusCode.OK);
        result.setFlag(true);
        result.setMessage("查询成功");
        result.setData(data);
        return result;
    }


    /**
     * 根据ID查询
     * @return
     */
    @GetMapping("/{labelId}")
    public Result  findById(@PathVariable String labelId){
        TbLabel tbLabel = tbLabelService.selectByPrimaryKey(labelId);
        return new Result(StatusCode.OK, true, "查询成功", tbLabel);
    }
    /**
     *
     * 修改标签
     * @param labelId
     * @param tbLabel
     * @return
     */
    @PutMapping("/{labelId}")
    public Result update(@PathVariable String labelId, TbLabel tbLabel){
        tbLabel.setId(labelId);
        tbLabelService.updateByPrimaryKey(tbLabel);
        return new Result(StatusCode.OK, true, "修改成功", null);
    }

    /**
     *
     * 根据ID删除
     * @param labelId
     * @return
     */
    @DeleteMapping("/{labelId}")
    public Result  deleteById(@PathVariable String labelId){
        tbLabelService.deleteByPrimaryKey(labelId);
        return new Result(StatusCode.OK, true, "删除成功", null);
    }



}
