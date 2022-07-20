package entitiess;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "review", schema = "public")
public class ReviewEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "review_info")
    private String ReviewInfo;
    @Column(name = "valid")
    private boolean valid;
    @ManyToOne
    @JoinColumn(name = "created_by", referencedColumnName = "id")
    private UserEntity createdBy;

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewInfo() {
        return ReviewInfo;
    }

    public void setReviewInfo(String reviewInfo) {
        ReviewInfo = reviewInfo;
    }

    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }
}
