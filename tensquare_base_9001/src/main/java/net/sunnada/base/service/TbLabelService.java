package net.sunnada.base.service;

import net.sunnada.base.mapper.TbLabelMapper;
import net.sunnada.base.pojo.TbLabel;
import net.sunnada.base.pojo.TbLabelExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbLabelService {
    @Resource
    private TbLabelMapper tbLabelMapper;

    public int countByExample(TbLabelExample example){
        return tbLabelMapper.countByExample(example);
    }

    public int deleteByExample(TbLabelExample example) {
        return tbLabelMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(String id) {
        return tbLabelMapper.deleteByPrimaryKey(id);
    }

    public int insert(TbLabel record) {
        return tbLabelMapper.insert(record);
    }

    public int insertSelective(TbLabel record) {
        return tbLabelMapper.insertSelective(record);
    }

    public List<TbLabel> selectByExample(TbLabelExample example) {
        return tbLabelMapper.selectByExample(example);
    }

    public TbLabel selectByPrimaryKey(String id) {
        return tbLabelMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(TbLabel record, TbLabelExample example) {
        return tbLabelMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(TbLabel record, TbLabelExample example) {
        return tbLabelMapper.updateByExample(record, example);
    }

    public int updateByPrimaryKeySelective(TbLabel record) {
        return tbLabelMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(TbLabel record) {
        return tbLabelMapper.updateByPrimaryKey(record);
    }

}
