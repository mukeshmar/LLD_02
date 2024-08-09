package live.mukeshtechlab.builder.assignment.databaseConfigurationBuilder;

public class DatabaseConfigurationBuilder {
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    private DatabaseConfigurationBuilder(Builder builder){
        this.databaseUrl = builder.databaseUrl;
        this.username = builder.username;
        this.password = builder.password;
        this.maxConnections = builder.maxConnections;
        this.enableCache = builder.enableCache;
        this.isReadOnly = builder.isReadOnly;
    }

    // Method to get Builder
    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        // Method to return DatabaseConnectionBuilder
        public DatabaseConfigurationBuilder build(){
            return new DatabaseConfigurationBuilder(this);
        }

        // Setter
        public Builder setDatabaseUrl(String databaseUrl){
            this.databaseUrl = databaseUrl;
            return this;
        }
        public Builder setUsername(String username){
            this.username = username;
            return this;
        }
        public Builder setPassword(String password){
            this.password = password;
            return this;
        }
        public Builder setMaxConnections(int maxConnections){
            this.maxConnections = maxConnections;
            return this;
        }
        public Builder setEnableCache(boolean enableCache){
            this.enableCache = enableCache;
            return this;
        }
        public Builder setIsReadyOnly(boolean isReadyOnly){
            this.isReadOnly = isReadyOnly;
            return this;
        }

        // Getter
        public String getDatabaseUrl(){
            return databaseUrl;
        }
        public String getUsername(){
            return username;
        }
        public String getPassword(){
            return password;
        }
        public int getMaxConnections(){
            return maxConnections;
        }
        public boolean getEnableCache(){
            return enableCache;
        }
        public boolean getIsReadyOnly(){
            return isReadOnly;
        }

    }

}