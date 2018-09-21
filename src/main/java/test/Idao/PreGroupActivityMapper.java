package test.Idao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.pojo.PreGroupActivity;
import test.pojo.PreGroupActivityExample;

public interface PreGroupActivityMapper {
    int countByExample(PreGroupActivityExample example);

    int deleteByExample(PreGroupActivityExample example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(PreGroupActivity record);

    int insertSelective(PreGroupActivity record);

    List<PreGroupActivity> selectByExample(PreGroupActivityExample example);

    PreGroupActivity selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") PreGroupActivity record, @Param("example") PreGroupActivityExample example);

    int updateByExample(@Param("record") PreGroupActivity record, @Param("example") PreGroupActivityExample example);

    int updateByPrimaryKeySelective(PreGroupActivity record);

    int updateByPrimaryKey(PreGroupActivity record);
}