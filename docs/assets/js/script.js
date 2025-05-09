document.addEventListener("DOMContentLoaded", function () {
	// Initialize code highlighting
	hljs.highlightAll();

	// Navigation handling
	const navLinks = document.querySelectorAll(".sidebar-nav a");
	const sections = document.querySelectorAll(".project-section");

	navLinks.forEach((link) => {
		link.addEventListener("click", function (e) {
			e.preventDefault();

			// Remove active class from all links and sections
			navLinks.forEach((link) => link.classList.remove("active"));
			sections.forEach((section) => section.classList.remove("active"));

			// Add active class to clicked link
			this.classList.add("active");

			// Get the target section and make it active
			const targetId = this.getAttribute("href").substring(1);
			document.getElementById(targetId).classList.add("active");

			// Scroll to top of the section with smooth animation
			window.scrollTo({
				top: 0,
				behavior: "smooth",
			});

			// Close sidebar on mobile after selection
			if (window.innerWidth <= 768) {
				document.querySelector(".sidebar").classList.remove("open");
			}
		});
	});

	// Mobile menu toggle
	const createMobileMenuToggle = () => {
		if (!document.querySelector(".menu-toggle")) {
			const menuToggle = document.createElement("div");
			menuToggle.className = "menu-toggle";
			menuToggle.innerHTML = '<i class="fas fa-bars"></i>';
			document.querySelector(".content").prepend(menuToggle);

			menuToggle.addEventListener("click", function () {
				document.querySelector(".sidebar").classList.toggle("open");
			});
		}
	};

	// Handle window resize
	window.addEventListener("resize", function () {
		if (window.innerWidth <= 768) {
			createMobileMenuToggle();
		}
	});

	// Initialize mobile menu if needed
	if (window.innerWidth <= 768) {
		createMobileMenuToggle();
	}

	// Theme toggle functionality
	const themeToggle = document.querySelector(".theme-toggle");
	themeToggle.addEventListener("click", function () {
		const icon = this.querySelector("i");

		if (icon.classList.contains("fa-moon")) {
			// Switch to light theme
			document.documentElement.style.setProperty("--primary-bg", "#f5f5f5");
			document.documentElement.style.setProperty("--secondary-bg", "#e8e8e8");
			document.documentElement.style.setProperty("--tertiary-bg", "#d8d8d8");
			document.documentElement.style.setProperty("--text-primary", "#333333");
			document.documentElement.style.setProperty("--text-secondary", "#666666");
			document.documentElement.style.setProperty("--border-color", "#cccccc");

			icon.classList.remove("fa-moon");
			icon.classList.add("fa-sun");
		} else {
			// Switch to dark theme
			document.documentElement.style.setProperty("--primary-bg", "#1a1a1a");
			document.documentElement.style.setProperty("--secondary-bg", "#252525");
			document.documentElement.style.setProperty("--tertiary-bg", "#2d2d2d");
			document.documentElement.style.setProperty("--text-primary", "#e0e0e0");
			document.documentElement.style.setProperty("--text-secondary", "#b0b0b0");
			document.documentElement.style.setProperty("--border-color", "#3a3a3a");

			icon.classList.remove("fa-sun");
			icon.classList.add("fa-moon");
		}
	});

	// Add "Copy Code" functionality
	const codeBlocks = document.querySelectorAll("pre code");
	codeBlocks.forEach((block) => {
		const copyBtn = document.createElement("button");
		copyBtn.className = "copy-btn";
		copyBtn.innerHTML = '<i class="fas fa-copy"></i>';
		copyBtn.style.position = "absolute";
		copyBtn.style.top = "10px";
		copyBtn.style.left = "10px";
		copyBtn.style.backgroundColor = "var(--tertiary-bg)";
		copyBtn.style.border = "none";
		copyBtn.style.borderRadius = "4px";
		copyBtn.style.padding = "5px 8px";
		copyBtn.style.cursor = "pointer";
		copyBtn.style.color = "var(--text-secondary)";

		const parent = block.parentElement;
		parent.style.position = "relative";
		parent.appendChild(copyBtn);

		copyBtn.addEventListener("click", () => {
			const code = block.textContent;
			navigator.clipboard.writeText(code).then(() => {
				copyBtn.innerHTML = '<i class="fas fa-check"></i>';
				copyBtn.style.color = "var(--success-color)";

				setTimeout(() => {
					copyBtn.innerHTML = '<i class="fas fa-copy"></i>';
					copyBtn.style.color = "var(--text-secondary)";
				}, 2000);
			});
		});
	});

	// Add animation to sections when they come into view
	const observer = new IntersectionObserver(
		(entries) => {
			entries.forEach((entry) => {
				if (entry.isIntersecting) {
					entry.target.style.animation = "fadeIn 0.6s ease forwards";
				}
			});
		},
		{ threshold: 0.1 }
	);

	document.querySelectorAll(".project-section").forEach((section) => {
		observer.observe(section);
	});
});
