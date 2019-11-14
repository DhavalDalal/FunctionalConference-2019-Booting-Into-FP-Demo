
sum(Acc, []) -> Acc;
sum(Acc, [X|XS]) -> sum(Acc + X, XS).

sum(List) -> sum(0, List).

main(_) ->
	io:format("~p~n", [sum([])]),
	io:format("~p~n", [sum([1, 2, 3, 4])]).
