package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/4/29.
 */
@Entity
@Table(name = "tb_liveroom", schema = "my_ylrc", catalog = "")
public class TbLiveroomEntity {
    private int liveRoomId;
    private int liveRoomOwnerId;
    private String liveRoomFollowerId;
    private Integer liveRoomState;

    @Id
    @Column(name = "LiveRoomId", nullable = false)
    public int getLiveRoomId() {
        return liveRoomId;
    }

    public void setLiveRoomId(int liveRoomId) {
        this.liveRoomId = liveRoomId;
    }

    @Basic
    @Column(name = "LiveRoomOwnerId", nullable = false)
    public int getLiveRoomOwnerId() {
        return liveRoomOwnerId;
    }

    public void setLiveRoomOwnerId(int liveRoomOwnerId) {
        this.liveRoomOwnerId = liveRoomOwnerId;
    }

    @Basic
    @Column(name = "LiveRoomFollowerId", nullable = true, length = 200)
    public String getLiveRoomFollowerId() {
        return liveRoomFollowerId;
    }

    public void setLiveRoomFollowerId(String liveRoomFollowerId) {
        this.liveRoomFollowerId = liveRoomFollowerId;
    }

    @Basic
    @Column(name = "LiveRoomState", nullable = true)
    public Integer getLiveRoomState() {
        return liveRoomState;
    }

    public void setLiveRoomState(Integer liveRoomState) {
        this.liveRoomState = liveRoomState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbLiveroomEntity that = (TbLiveroomEntity) o;

        if (liveRoomId != that.liveRoomId) return false;
        if (liveRoomOwnerId != that.liveRoomOwnerId) return false;
        if (liveRoomFollowerId != null ? !liveRoomFollowerId.equals(that.liveRoomFollowerId) : that.liveRoomFollowerId != null)
            return false;
        if (liveRoomState != null ? !liveRoomState.equals(that.liveRoomState) : that.liveRoomState != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = liveRoomId;
        result = 31 * result + liveRoomOwnerId;
        result = 31 * result + (liveRoomFollowerId != null ? liveRoomFollowerId.hashCode() : 0);
        result = 31 * result + (liveRoomState != null ? liveRoomState.hashCode() : 0);
        return result;
    }
}
