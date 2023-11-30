require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: *start
        a: 让我们开始吧

    state: Hello
        intent!: /hello
        a: 嗨 嗨

    state: Bye
        intent!: /bye
        a: 而 而

    state: NoMatch
        event!: noMatch
        a: 我不明白. 你说: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}