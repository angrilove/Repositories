
cd .
type T_ZZDW_SQ.sql > TEMP.SQL
type T_ZZDW_BG.sql >> TEMP.SQL
type T_ZZDW_YX.sql >> TEMP.SQL
type T_ZZDW_ZX.sql >> TEMP.SQL

type TEMP.SQL > T_ZZDW.sql

del TEMP.SQL

pause
