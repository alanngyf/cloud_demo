package com.gbacoder.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author alanulog
 * @create 6/23/2024 8:25 PM
 */

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
