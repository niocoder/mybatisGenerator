package test.Idao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.pojo.PreGroupFollow;
import test.pojo.PreGroupFollowExample;

public interface PreGroupFollowMapper {
    int countByExample(PreGroupFollowExample example);

    int deleteByExample(PreGroupFollowExample example);

    int deleteByPrimaryKey(Integer followId);

    int insert(PreGroupFollow record);

    int insertSelective(PreGroupFollow record);

    List<PreGroupFollow> selectByExample(PreGroupFollowExample example);

    PreGroupFollow selectByPrimaryKey(Integer followId);

    int updateByExampleSelective(@Param("record") PreGroupFollow record, @Param("example") PreGroupFollowExample example);

    int updateByExample(@Param("record") PreGroupFollow record, @Param("example") PreGroupFollowExample example);

    int updateByPrimaryKeySelective(PreGroupFollow record);

    int updateByPrimaryKey(PreGroupFollow record);
}