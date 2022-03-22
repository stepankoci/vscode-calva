# VSCode + Calva + deps.edn + shadow-cljs

## Setup

- clojure --version => Clojure CLI version 1.10.3.1087
- MacBook Pro (13-inch, M1, 2020)
- java --version => 
  - openjdk 17.0.2 2022-01-18
  - OpenJDK Runtime Environment Homebrew (build 17.0.2+0)
  - OpenJDK 64-Bit Server VM Homebrew (build 17.0.2+0, mixed mode, sharing)
- VS Code
  - Version: 1.65.2
  - Commit: c722ca6c7eed3d7987c0d5c3df5c45f6b15e77d1
  - Date: 2022-03-10T14:42:05.236Z (1 wk ago)
  - Electron: 13.5.2
  - Chromium: 91.0.4472.164
  - Node.js: 14.16.0
  - V8: 9.1.269.39-electron.0
  - OS: Darwin arm64 21.1.0
- Calva
  - Last updated 19. 3. 2022 9:18:14

## Steps

- `yarn install`
- `yarn run watch`
- open browser at http://localhost:8000/ => shows *Hi World* in console (compilation is working)
- **lsp is running, code navigation, lint etc is working**
- `cmd+shift+p` + connect to a running REPL server in the project
  - chosen: deps.edn + shadow-cljs
  - chosen: localhost:port
  - chosen: :app
- repl is running and code evaluation is working
- **code navigation, lint etc is not working**
