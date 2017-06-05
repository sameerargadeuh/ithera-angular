package com.unityhealth.api.domain.self.group;


import com.unityhealth.api.domain.self.store.Store;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by shanefox on 24/10/2016.
 */
@Entity
@Table(name = "tblgroups")
public class Group {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "iID")
    private Integer id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "group", cascade=CascadeType.ALL)
    private Set<Store> stores;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Store> getStores() {
        return stores;
    }

    public void setStores(Set<Store> stores) {
        this.stores = stores;
    }
}
