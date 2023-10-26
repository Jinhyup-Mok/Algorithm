-- 코드를 입력하세요

with tmp as (
    select host_id, count(host_id) as cnt
    from places
    group by host_id
)

SELECT id, name, p.host_id
from places as p
join tmp as t on p.host_id = t.host_id 
where t.cnt >= 2
order by 1