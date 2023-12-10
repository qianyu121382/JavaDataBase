package book.entity.Mapping;


public class MonitorResult {

  private long taskId;
  private long indicatorId;
  private long deviceId;
  private double result;
  private String abnormalStatus;


  public long getTaskId() {
    return taskId;
  }

  public void setTaskId(long taskId) {
    this.taskId = taskId;
  }


  public long getIndicatorId() {
    return indicatorId;
  }

  public void setIndicatorId(long indicatorId) {
    this.indicatorId = indicatorId;
  }


  public long getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(long deviceId) {
    this.deviceId = deviceId;
  }


  public double getResult() {
    return result;
  }

  public void setResult(double result) {
    this.result = result;
  }


  public String getAbnormalStatus() {
    return abnormalStatus;
  }

  public void setAbnormalStatus(String abnormalStatus) {
    this.abnormalStatus = abnormalStatus;
  }

}
