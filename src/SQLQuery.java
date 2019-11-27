
// For Sql query problem

select * from(select Id, salary, dense_rank())
over(order by sal desc) r from Employee)
where r = &n