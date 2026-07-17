-- Write your query below
select e.student_id,e.exam_id,e.score from exam_results e
where e.exam_id = (
    select min(a.exam_id) from exam_results a where a.score = (
        select max(score) from exam_results where
        student_id = e.student_id
    ) and a.student_id = e.student_id
) order by e.student_id;