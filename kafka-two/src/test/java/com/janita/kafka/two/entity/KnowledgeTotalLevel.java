package com.janita.kafka.two.entity;

import java.io.Serializable;

/**
 * 各个知识点的掌握程度
 * @author Eden
 *
 */
public class KnowledgeTotalLevel implements Serializable{

    private static final long serialVersionUID = 1L;

    private String knoId;
    
    private int level;

    public KnowledgeTotalLevel() {
        super();
    }

    public KnowledgeTotalLevel(String knoId, int level) {
        super();
        this.knoId = knoId;
        this.level = level;
    }

    
    public String getKnoId() {
        return knoId;
    }

    
    public void setKnoId(String knoId) {
        this.knoId = knoId;
    }

    
    public int getLevel() {
        return level;
    }

    
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "KnowledgeTotleLevel [knoId=" + knoId + ", level=" + level + "]";
    }
    
}

