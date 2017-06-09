package com.unityhealth.api.domain.self.store;

import com.unityhealth.api.domain.self.group.Group;

import javax.persistence.*;

/**
 * Created by shanefox on 24/10/2016.
 */
@Entity
@Table(name = "tblstores")
public class Store {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "iID", columnDefinition = "UNSIGNED INT(10)")
    private Integer id;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="iGroupID")
    private Group group;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
