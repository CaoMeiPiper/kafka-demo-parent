package com.janita.kafka.two.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 学生在一次考试中对于所考知识点的实体类
 * @author Eden
 *
 */
public class StudentTotalLevel implements Serializable{

    private static final long serialVersionUID = 1L;
    private String studentId;
    private List<KnowledgeTotalLevel> knoTotalLevelList;
    
    public StudentTotalLevel() {
       
    }

    public StudentTotalLevel(String studentId, List<KnowledgeTotalLevel> knoTotalLevelList) {
        super();
        this.studentId = studentId;
        this.knoTotalLevelList = knoTotalLevelList;
    }

    
    public String getStudentId() {
        return studentId;
    }

    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    
    public List<KnowledgeTotalLevel> getKnoTotalLevel() {
        return knoTotalLevelList;
    }

    
    public void setKnoTotalLevel(List<KnowledgeTotalLevel> knoTotalLevelList) {
        this.knoTotalLevelList = knoTotalLevelList;
    }

    @Override
    public String toString() {
        return "StudentTotalLevel [studentId=" + studentId + ", knoTotalLevelList=" + knoTotalLevelList + "]";
    }
    
    
    
    
}
