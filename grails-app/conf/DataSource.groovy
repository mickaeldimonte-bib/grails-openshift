/*dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}*/
dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
    /*development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
        }
    }*/
  development {
        dataSource {
          dbCreate = "update"
          url = "jdbc:mysql://eu-cdbr-azure-west-d.cloudapp.net:3306/grails_db"
          username = "bf90c22556e473"
          password = "9c68c271"
        }
    }
    test {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://eu-cdbr-azure-west-d.cloudapp.net:3306/grails_db"
            username = "sa"
            password = ""
        }
    }
    production {
        dataSource {
          dbCreate = "update"
          url = "jdbc:mysql://eu-cdbr-azure-west-d.cloudapp.net:3306/grails_db"
          username = "bf90c22556e473"
          password = "9c68c271"
        }
    }
}

