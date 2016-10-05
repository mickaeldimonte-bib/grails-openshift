dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
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
    development {
         dataSource {
          driverClassName = "com.mysql.jdbc.Driver"
            dbCreate = "update"
            url = "jdbc:mysql://172.30.141.172:3306/grails?autoreconnect=true"
            username = "grails"
            password = "grails"
            logSql = false
        }
    }
    test {
         dataSource {
          driverClassName = "com.mysql.jdbc.Driver"
            dbCreate = "update"
            url = "jdbc:mysql://172.30.141.172:3306/grails?autoreconnect=true"
            username = "grails"
            password = "grails"
            logSql = false
        }
    }
    production {
           dataSource {
            driverClassName = "com.mysql.jdbc.Driver"
              dbCreate = "update"
              url = "jdbc:mysql://172.30.141.172:3306/grails?autoreconnect=true"
              username = "grails"
              password = "grails"
              logSql = false
          }
    }
}
