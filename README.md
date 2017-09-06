# Repro for issue with re-frisk-sidecar dependencies


## Usage

Run `lein test`

output: 

```ERROR in (repro) (core.clj:4725)
Uncaught exception, not in assertion.
expected: nil
  actual: clojure.lang.ExceptionInfo: Reader tag must be a symbol
```

Because re-frisk is AOT compiled, the exclusions don't work, and an old version of tools.reader is being used. 

## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
