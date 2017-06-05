import { ItherapeuticsPage } from './app.po';

describe('itherapeutics App', () => {
  let page: ItherapeuticsPage;

  beforeEach(() => {
    page = new ItherapeuticsPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
