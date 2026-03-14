# ✦ Yandoor App <img align="right" width="100" height="100" src="https://github.com/berkchy/yandoor-app/raw/main/app/src/main/res/mipmap/ic_launcher.png" alt="Yandoor Icon" style="border-radius:20%;"/>

## Features

- [NSFW/SFW] Content support  
- [Theme] Multi-color themes (Dark / Light / Custom)  
- [Navigation] Back button WebView navigation  
- [Performance] Lightweight and fast Android app  
- [CI/CD] Automated Release APK generation via GitHub Actions  

---

## Installation

1. Clone the repository:

```bash
git clone https://github.com/berkchy/yandoor-app.git
cd yandoor-app
```

2. Build with Gradle:

```bash
./gradlew clean assembleRelease
```

---

GitHub Actions

The release workflow is ready. When you push a tag, Yandoor.apk is automatically uploaded to the Release section.

Workflow file: .github/workflows/build.yml
