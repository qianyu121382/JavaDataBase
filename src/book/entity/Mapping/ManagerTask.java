package book.entity.Mapping;

import java.util.Date;

public class ManagerTask {

    private long taskId;
    private long superiorId;
    private String type;
    private long id;
    private Date updateTime;
    private Date createTime;


    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }


    public long getSuperiorId() {
        return superiorId;
    }

    public void setSuperiorId(long superiorId) {
        this.superiorId = superiorId;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
