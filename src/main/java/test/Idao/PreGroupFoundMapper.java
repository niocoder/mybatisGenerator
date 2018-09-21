package test.Idao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.pojo.PreGroupFound;
import test.pojo.PreGroupFoundExample;

public interface PreGroupFoundMapper {
    int countByExample(PreGroupFoundExample example);

    int deleteByExample(PreGroupFoundExample example);

    int deleteByPrimaryKey(Integer foundId);

    int insert(PreGroupFound record);

    int insertSelective(PreGroupFound record);

    List<PreGroupFound> selectByExample(PreGroupFoundExample example);

    PreGroupFound selectByPrimaryKey(Integer foundId);

    int updateByExampleSelective(@Param("record") PreGroupFound record, @Param("example") PreGroupFoundExample example);

    int updateByExample(@Param("record") PreGroupFound record, @Param("example") PreGroupFoundExample example);

    int updateByPrimaryKeySelective(PreGroupFound record);

    int updateByPrimaryKey(PreGroupFound record);
}