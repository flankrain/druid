package com.alibaba.druid.hbase.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public interface HStatement extends Statement {
    HBaseConnection getConnection() throws SQLException;
}
