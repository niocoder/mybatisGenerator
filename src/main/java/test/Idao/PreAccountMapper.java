package test.Idao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.pojo.PreAccount;
import test.pojo.PreAccountExample;

public interface PreAccountMapper {
    int countByExample(PreAccountExample example);

    int deleteByExample(PreAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PreAccount record);

    int insertSelective(PreAccount record);

    List<PreAccount> selectByExample(PreAccountExample example);

    PreAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PreAccount record, @Param("example") PreAccountExample example);

    int updateByExample(@Param("record") PreAccount record, @Param("example") PreAccountExample example);

    int updateByPrimaryKeySelective(PreAccount record);

    int updateByPrimaryKey(PreAccount record);
}