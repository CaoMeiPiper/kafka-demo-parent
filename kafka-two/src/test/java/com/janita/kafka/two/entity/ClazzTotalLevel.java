package com.janita.kafka.two.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 一次考试中一个班级各个知识点的学整体掌握程度
 * @author Eden
 *
 */
public class ClazzTotalLevel implements Serializable{
   
    private static final long serialVersionUID = 1L;
    
    private String progressId;
    
    private String ProgressName;
    
    private String teacherId;
    
    private String termId;
    
    private String courseId;
    
    //老师点击提交的时间
    private long upTime;
    
    private String clazzId;
    
    private String gradeId;
    
    //该次历程时间
    private long progressTime;
    
    //kafka采集时间采集数据
    private long collectTime;
    
    private List<StudentTotalLevel> stuTotalLevelList;

    public ClazzTotalLevel() {
        super();
    }

    public ClazzTotalLevel(String progressId, String progressName, String teacherId, String termId, String courseId,
            long upTime, String clazzId, String gradeId, long progressTime, long collectTime,
            List<StudentTotalLevel> stuTotalLevelList) {
        super();
        this.progressId = progressId;
        ProgressName = progressName;
        this.teacherId = teacherId;
        this.termId = termId;
        this.courseId = courseId;
        this.upTime = upTime;
        this.clazzId = clazzId;
        this.gradeId = gradeId;
        this.progressTime = progressTime;
        this.collectTime = collectTime;
        this.stuTotalLevelList = stuTotalLevelList;
    }

    
    public String getProgressId() {
        return progressId;
    }

    
    public void setProgressId(String progressId) {
        this.progressId = progressId;
    }

    
    public String getProgressName() {
        return ProgressName;
    }

    
    public void setProgressName(String progressName) {
        ProgressName = progressName;
    }

    
    public String getTeacherId() {
        return teacherId;
    }

    
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    
    public String getTermId() {
        return termId;
    }

    
    public void setTermId(String termId) {
        this.termId = termId;
    }

    
    public String getCourseId() {
        return courseId;
    }

    
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    
    public long getUpTime() {
        return upTime;
    }

    
    public void setUpTime(long upTime) {
        this.upTime = upTime;
    }

    
    public String getClazzId() {
        return clazzId;
    }

    
    public void setClazzId(String clazzId) {
        this.clazzId = clazzId;
    }

    
    public String getGradeId() {
        return gradeId;
    }

    
    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    
    public long getProgressTime() {
        return progressTime;
    }

    
    public void setProgressTime(long progressTime) {
        this.progressTime = progressTime;
    }

    
    public long getCollectTime() {
        return collectTime;
    }

    
    public void setCollectTime(long collectTime) {
        this.collectTime = collectTime;
    }

    
    public List<StudentTotalLevel> getStuTotalLevelList() {
        return stuTotalLevelList;
    }

    
    public void setStuTotalLevelList(List<StudentTotalLevel> stuTotalLevelList) {
        this.stuTotalLevelList = stuTotalLevelList;
    }

    @Override
    public String toString() {
        return "ClazzTotalLevel [progressId=" + progressId + ", ProgressName=" + ProgressName + ", teacherId="
                + teacherId + ", termId=" + termId + ", courseId=" + courseId + ", upTime=" + upTime + ", clazzId="
                + clazzId + ", gradeId=" + gradeId + ", progressTime=" + progressTime + ", collectTime=" + collectTime
                + ", stuTotalLevelList=" + stuTotalLevelList + "]";
    }

   
    
}
