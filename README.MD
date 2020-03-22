Postgresql connect via ip address: 

# in the pg_hba.conf add more 2 line

  host all all 0.0.0.0/0 md5
  host all all ::1/32 md5

# In postgresql.conf , find a line 
listen_addresses="localhost" change to listen_addresses="*" and uncomment

# remove --network on your run command 


